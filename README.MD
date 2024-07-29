
### Common - Ingress

```yaml
apiVersion: networking.k8s.io/v1
kind: Ingress
metadata:
  name: contact-service
  labels:
    helm.sh/chart: contact-service-0.1.0
    app.kubernetes.io/name: contact-service
    app.kubernetes.io/instance: release
    app.kubernetes.io/version: "1.16.0"
    app.kubernetes.io/managed-by: Helm
  annotations:
    ingress.kubernetes.io/enable-cors: "true"
    nginx.ingress.kubernetes.io/rewrite-target: /$1
spec:
  rules:
     - http:
        paths:
          - path: /contact-service
            pathType: Prefix
            backend:
              service:
                name: contact-service
                port:
                  number: 80

```